grammar MdlGrammar;

mdlfile 
    :
        (versionNote)
        (modelStructure)
        (sequencesBlock)
        (globalSequenceBlock)?
        (textureBlock)
        (materialBlock)
        (textureAnimBlock)?
        (geosetBlock)*
        (geosetAnim)*
        (boneDef)*
        lightDef*
        pivotDef?
    ;

versionNote 
    :
        'Version' CURLY_BRACKET_OPEN
        'FormatVersion' formatVersion=INT COMMA
        CURLY_BRACKET_CLOSE
    ;

modelStructure
    :
        'Model' modelName=STRING CURLY_BRACKET_OPEN
            ('NumGeosets' geosetCount=INT COMMA)? 
            ('NumGeosetAnims' geosetAnimCount=INT COMMA)?
            ('NumHelpers' helperCount=INT COMMA)?
            ('NumLights' lightCount=INT COMMA)?
            ('NumBones' boneCount=INT COMMA)?
            ('NumAttachments' attachmentCount=INT COMMA)?
            ('NumParticleEmitters' emitters1Count=INT COMMA)?
            ('NumParticleEmitters2' emitters2Count=INT COMMA)?
            ('NumRibbonEmitters' ribbonEmittersCount=INT COMMA)?
            ('NumEvents' eventCount=INT COMMA)?
            ('BlendTime' blendTime=INT COMMA)
            ('MinimumExtent' minExtend=threeFTuple COMMA)?
            ('MaximumExtent' maxExtend=threeFTuple COMMA)?
            ('BoundsRadius' boundsRadius=FLOAT COMMA)?
        CURLY_BRACKET_CLOSE
    ;

sequencesBlock
    :
        'Sequences' sequenceCount=INT CURLY_BRACKET_OPEN
            animations+=animationBlock*
        CURLY_BRACKET_CLOSE
    ;

animationBlock
    :
        'Anim' animName=STRING? CURLY_BRACKET_OPEN
            ('Interval' CURLY_BRACKET_OPEN intervalx=INT COMMA intervaly=INT CURLY_BRACKET_CLOSE COMMA)?
            ('NonLooping' COMMA)?
            ('MoveSpeeed' moveSpeed=FLOAT COMMA)?
            ('Rarity' rarity=FLOAT COMMA)?
            ('MinimumExtent' minExtend=threeFTuple COMMA)?
            ('MaximumExtent' maxExtend=threeFTuple COMMA)?
            ('BoundsRadius' boundsRadius=FLOAT COMMA)?
        CURLY_BRACKET_CLOSE
    ;

globalSequenceBlock
    :
        'GlobalSequences' INT CURLY_BRACKET_OPEN
            ('Duration' durations+=INT COMMA)*
        CURLY_BRACKET_CLOSE
    ;

textureBlock 
    :
        'Textures' textureId=INT CURLY_BRACKET_OPEN
            bitmaps+=bitmapDef*
        CURLY_BRACKET_CLOSE
    ;

bitmapDef
    :
        'Bitmap' CURLY_BRACKET_OPEN
            'Image' imagePath=STRING COMMA
            ('ReplaceableId' replaceableId=INT COMMA)?
            (wrapWidth='WrapWidth' COMMA)?
            (wrapHeight='WrapHeight' COMMA)?
        CURLY_BRACKET_CLOSE
    ;

materialBlock
    :
        'Materials' INT CURLY_BRACKET_OPEN
            materials+=materialDef*
        CURLY_BRACKET_CLOSE
    ;

materialDef
    :
        'Material' CURLY_BRACKET_OPEN
            ('ConstantColor' COMMA)?
            ('SortPrimsFarZ' COMMA)?
            ('FullResolution' COMMA)?
            ('PriorityPlane' INT COMMA)?
            layers+=layerDef+
        CURLY_BRACKET_CLOSE
    ;

layerDef
    :
        'Layer' CURLY_BRACKET_OPEN
            'FilterMode' ( 'None'
                         | 'Transparent'
                         | 'Blend'
                         | 'Additive'
                         | 'AddAlpha'
                         | 'Modulate'
                         | 'Modulate2x' ) COMMA
            ('Unshaded' COMMA)?
            ('SphereEnvMap' COMMA)?
            ('TwoSided' COMMA)?
            ('Unfogged' COMMA)?
            ('NoDepthTest' COMMA)?
            ('NoDepthSet' COMMA)?
            ('static' ('TextureID' textureId=INT | '(' 'TextureID' INT ')') COMMA)
            ('TVertexAnimId' INT COMMA)?
            ('CoordId' INT COMMA)?
            (('static' BRACKET_OPEN? 'Alpha' FLOAT BRACKET_CLOSE? COMMA)
             |alphaDef)?
        CURLY_BRACKET_CLOSE
        
    ;

alphaDef
    :
        'Alpha' INT CURLY_BRACKET_OPEN
            ('DontInterp' COMMA)?
            (INT ':' FLOAT COMMA)*
        CURLY_BRACKET_CLOSE
    ;
        

textureAnimBlock
    :
        'TexturesAnims' INT CURLY_BRACKET_OPEN
            tvertexAnimDef*
        CURLY_BRACKET_CLOSE
    ;

tvertexAnimDef
    :
        'TVertexAnim' CURLY_BRACKET_OPEN
            '(' 'Translation' threeFTuple ')'
            '(' 'Rotation' fourFTuple ')'
            '(' 'Scaling' threeFTuple ')'
        CURLY_BRACKET_CLOSE
    ;

geosetBlock
    :
        'Geoset' CURLY_BRACKET_OPEN
            verticesDef
            normalsDef?
            tverticesDef?
            vertexGroupDef
            facesDef
            groupsDef
            ('MinimumExtent' threeFTuple COMMA)?
            ('MaximumExtent' threeFTuple COMMA)?
            ('BoundsRadius' FLOAT COMMA)?
            animationBlock*
            'MaterialID' materialId=INT COMMA
            'SelectionGroup' INT COMMA
            ('Unselectable' COMMA)?
            CURLY_BRACKET_CLOSE
    ;

verticesDef
    :
        'Vertices' vertexCount=INT CURLY_BRACKET_OPEN
            (vertexPos+=threeFTuple COMMA)*
        CURLY_BRACKET_CLOSE
    ;

normalsDef
    :
        'Normals' INT CURLY_BRACKET_OPEN
            (normals+=threeFTuple COMMA)*
        CURLY_BRACKET_CLOSE
    ;

tverticesDef
    :
        'TVertices' tvertCount=INT CURLY_BRACKET_OPEN
            (textureCoords+=twoFTuple COMMA)*
        CURLY_BRACKET_CLOSE
    ;

vertexGroupDef
    :
        'VertexGroup'  CURLY_BRACKET_OPEN
            (INT COMMA)*
        CURLY_BRACKET_CLOSE
    ;
            
facesDef
    :
        'Faces' INT facesCount=INT CURLY_BRACKET_OPEN
            triangle=trianglesDef*
        CURLY_BRACKET_CLOSE

    ;

trianglesDef
    :
        'Triangles' CURLY_BRACKET_OPEN
            CURLY_BRACKET_OPEN (tris+=INT COMMA)* lastTri=INT CURLY_BRACKET_CLOSE COMMA
        CURLY_BRACKET_CLOSE
        
    ;

groupsDef
    :
        'Groups' INT INT CURLY_BRACKET_OPEN
            ('Matrices' CURLY_BRACKET_OPEN INT (INT COMMA)* CURLY_BRACKET_CLOSE COMMA)*
        CURLY_BRACKET_CLOSE
    ;

twoFTuple
    :
        CURLY_BRACKET_OPEN x=FLOAT COMMA y=FLOAT CURLY_BRACKET_CLOSE
    ;

threeFTuple
    :
        CURLY_BRACKET_OPEN x=FLOAT COMMA y=FLOAT COMMA z=FLOAT CURLY_BRACKET_CLOSE
    ;

fourFTuple
    :
        CURLY_BRACKET_OPEN v=FLOAT COMMA w=FLOAT COMMA x=FLOAT COMMA y=FLOAT CURLY_BRACKET_CLOSE
    ;

geosetAnim
    :
        'GeosetAnim' CURLY_BRACKET_OPEN
            ('DropShadow' COMMA)?
            'static' BRACKET_OPEN 'Alpha' FLOAT BRACKET_CLOSE COMMA
            ('static' '(' 'Color' threeFTuple ')' COMMA)?
            'GeosetId' INT COMMA
        CURLY_BRACKET_CLOSE
        
    ;

boneDef
    :
        'Bone' STRING CURLY_BRACKET_OPEN
            'ObjectId' INT COMMA
            ('Parent' INT COMMA)?
            ('BillboardedLockZ' COMMA)?
            ('BillboardedLockY' COMMA)?
            ('BillboardedLockX' COMMA)?
            ('Billboarded' COMMA)?
            ('CameraAnchored' COMMA)?
            ('DontInherit' CURLY_BRACKET_OPEN ('Rotation'|'Translation'|'Scaling') CURLY_BRACKET_CLOSE COMMA)?
            'GeosetId' (INT|'Multiple') COMMA
            'GeosetAnimId' (INT|'None') COMMA
            ('Translation' INT CURLY_BRACKET_OPEN 
                ('Hermite' COMMA)?
                (INT ':' threeFTuple COMMA
                'InTan' threeFTuple COMMA
                'OutTan' threeFTuple COMMA)+ CURLY_BRACKET_CLOSE)?
            ('Rotation' INT CURLY_BRACKET_OPEN 
                ('Hermite' COMMA)?
                (INT ':' fourFTuple COMMA
                'InTan' fourFTuple COMMA
                'OutTan' fourFTuple COMMA)+ CURLY_BRACKET_CLOSE)?
            ('Scaling' CURLY_BRACKET_OPEN threeFTuple BRACKET_CLOSE CURLY_BRACKET_CLOSE)?
            ('Visibility' CURLY_BRACKET_OPEN FLOAT BRACKET_CLOSE CURLY_BRACKET_CLOSE)?
        CURLY_BRACKET_CLOSE
    ;
            
lightDef
    :
        'Light' STRING CURLY_BRACKET_OPEN
            'ObjectId' INT COMMA
            'Parent' INT COMMA
            ('BillboardedLockZ' COMMA)?
            ('BillboardedLockY' COMMA)?
            ('BillboardedLockX' COMMA)?
            ('Billboarded' COMMA)?
            ('CameraAnchored' COMMA)?
            ('DontInherit' CURLY_BRACKET_OPEN ( 'Rotation'|'Translation'|'Scaling') CURLY_BRACKET_CLOSE COMMA)?
            ('Omnidirectional'|'Directional'|'Ambient')
            'static' 'AtennuationStart' FLOAT COMMA
            'static' 'AtennuationEnd' FLOAT COMMA
            'static' BRACKET_OPEN 'Intensity' FLOAT BRACKET_CLOSE COMMA
            'static' BRACKET_OPEN 'Color' threeFTuple BRACKET_CLOSE COMMA
            'static' BRACKET_OPEN 'AmbIntensity' FLOAT BRACKET_CLOSE COMMA
            'static' BRACKET_OPEN 'AmbColor' threeFTuple FLOAT BRACKET_CLOSE COMMA
            BRACKET_OPEN 'Visibility' FLOAT BRACKET_CLOSE COMMA
            BRACKET_OPEN 'Translation' threeFTuple BRACKET_CLOSE COMMA
            BRACKET_OPEN 'Rotation' fourFTuple BRACKET_CLOSE COMMA
            BRACKET_OPEN 'Scaling' threeFTuple BRACKET_CLOSE COMMA
        CURLY_BRACKET_CLOSE
    ;

pivotDef
    :
        'PivotPoints' INT CURLY_BRACKET_OPEN
            (threeFTuple COMMA)+
         CURLY_BRACKET_CLOSE
    ;

CURLY_BRACKET_OPEN      : '{' ;
CURLY_BRACKET_CLOSE     : '}' ;

BRACKET_OPEN      : '(' ;
BRACKET_CLOSE     : ')' ;

COMMA                   : ',' ;

INT                     : ('-')?('0'..'9')('0'..'9')* ;
FLOAT                   : ('-')?('0'..'9')('0'..'9')* ('.'('0'..'9')('0'..'9')*)? ;

STRING
    :  '"' (~'"' )* '"'
    ;

fragment
ESCAPESEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

NL : [\r|\t\u000C\n] ;
WS  :  [ \r\t\n]+ -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
    ;