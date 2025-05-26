                parser grammar AngularParser;

                options { tokenVocab=AngularLexer; }


              program:application* EOF;

              application
                  : importStatement   #IMPORTLABEL
                  | component         #COMPONENTLABEL
                  | classDeclaration  #CLASSLABEL
                  | injectable        #INJECTABLELABEL
                  ;

          importStatement
                : IMPORT OPEN_CURLY keyimport  (COMMA keyimport)*  CLOSE_CURLY FROM STRING SEMICOLON;

          keyimport: ONINIT
                    |IDENTIFIER
                    |STRING
                    ;

           component
               : COMPONENT OPEN_PAREN OPEN_CURLY metadata CLOSE_CURLY CLOSE_PAREN
               ;

           injectable :INJECTABLE OPEN_PAREN OPEN_CURLY
                metadata
                CLOSE_CURLY CLOSE_PAREN ;

           metadata
               : metadataEntry? (COMMA metadataEntry)*
               ;

           metadataEntry
                   :basicMetadata    #BasicMetadataLabel
                   |htmlMetadata     #HtmlMetadataLabel
                   |selector         #SELECTORLABEL
                   |templateurl      #TAMPLATEURLLABEL
               ;

           templateurl
               :TEMPLATEURL COLON STRING;

            selector
               : SELECTOR COLON STRING
               ;
           basicMetadata
               : IDENTIFIER COLON STRING
               ;

           htmlMetadata
               : IDENTIFIER COLON BACKTICK htmlElement* BACKTICK  //#TEMPLATELABEL
               ;

           classDeclaration
               : EXPORT CLASS IDENTIFIER classInheritance? OPEN_CURLY classBody CLOSE_CURLY   ;

           classInheritance
                   : EXTENDS IDENTIFIER
                   | IMPLEMENTS value (COMMA IDENTIFIER)*
               ;


          getproduct: GET_PRODUCTS OPEN_PAREN CLOSE_PAREN OPEN_CURLY RETURN OPEN_SQUARE elementList CLOSE_SQUARE SEMICOLON CLOSE_CURLY ;

          products: IDENTIFIER EQUALS  OPEN_SQUARE elementList CLOSE_SQUARE SEMICOLON    ;

           elementList  : element (COMMA element)*  ;

           element : OPEN_CURLY pair (COMMA pair)* CLOSE_CURLY     ;

           pair: basevalue COLON value    ;

           value
                : basevalue    #BASEvalueLABEL
                | arrayvalue   #ARRAYTAYPELABEL
                ;

           basevalue
                 : IDENTIFIER   #IDENTIFIRELABEL
                 | STRING      #STRINGLABEL
                 |NUMBER     # NUMBERLABEL
                 |ANY        #ANYLABEL
                 |VOID       #VOIDLABEL
                 |ONINIT      #ONINITLABEL
                 | NULL       #NULLLABEL
                ;
            classBody  : (propertyDeclaration | methodDeclaration | constructor | statement | decorator | ngOnInit | selectProduct | onbutton | getproduct | products | lambdaExpression|propertyAccess|functionDeclaration)*  #ClassBodyLabel;

         propertyDeclaration
             : regularProperty    #PROPIRTYLABEL
             | letDeclaration     #VARIBALLABEL
             | emptyArrayDeclaration  #DDD
             ;

          regularProperty
              : IDENTIFIER COLON value (EQUALS expression)? SEMICOLON
              ;
          letDeclaration
              : LET IDENTIFIER COLON value EQUALS value SEMICOLON
              ;
          emptyArrayDeclaration
              : IDENTIFIER COLON value OPEN_SQUARE CLOSE_SQUARE EQUALS OPEN_SQUARE CLOSE_SQUARE SEMICOLON
              ;

          constructor  : CONSTRUCTOR OPEN_PAREN (parameter (COMMA parameter)*)? CLOSE_PAREN OPEN_CURLY  statement*  CLOSE_CURLY  ;


         loopStatement
              : FOR OPEN_PAREN LET IDENTIFIER EQUALS expression SEMICOLON expression SEMICOLON IDENTIFIER (PLUS_PLUS | MINUS_MINUS) CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY
              | FOR OPEN_PAREN LET IDENTIFIER IN IDENTIFIER (DOT IDENTIFIER)* CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY
              ;

                  whileStatement
                    : WHILE OPEN_PAREN expression CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY;

                  switchStatement
                    : SWITCH OPEN_PAREN expression CLOSE_PAREN OPEN_CURLY caseClause* CLOSE_CURLY;
                   ifStatement
                    : IF OPEN_PAREN equalityExpression CLOSE_PAREN OPEN_CURLY statement* CLOSE_CURLY
                      (ELSE OPEN_CURLY statement* CLOSE_CURLY)?;

                equalityExpression
                    : expression EQUALS EQUALS EQUALS expression # StrictEquality
                    | expression EQUALS EQUALS expression        # LooseEquality
                    | expression NOT_EQUAL expression            # NotEquality
                    | expression STRICT_NOT_EQUAL expression     # StrictNotEquality;

                   caseClause
                        : CASE expression COLON statement*
                        | DEFAULT COLON statement*;


//                  function:FUNICTION ADD OPEN_PAREN CLOSE_PAREN    ;
//                  ff:IDENTIFIER COLON
//
//                  ;
//                  functionw:FUNICTION LOGMESSAMGE OPEN_PAREN CLOSE_PAREN COLON basevalue OPEN_CURLY  propertystatment  CLOSE_CURLY;
//// جديد
                    functionDeclaration
                        : FUNICTION IDENTIFIER OPEN_PAREN parameterList? CLOSE_PAREN COLON value functionB;


                    functionB
                        : OPEN_CURLY statement* CLOSE_CURLY;

                   propertystatment: CONSOLE DOT LOG OPEN_PAREN expression CLOSE_PAREN SEMICOLON;



//                 propertystatment: CONSOLE DOT LOG OPEN_PAREN expression   CLOSE_PAREN SEMICOLON;

                  methodDeclaration
                 : IDENTIFIER OPEN_PAREN parameter (COMMA parameter)* CLOSE_PAREN COLON value OPEN_CURLY statement* CLOSE_CURLY;

                  parameter : modifiers? IDENTIFIER COLON value  ;

               modifiers
                   : PRIVATE
                   | PUBLIC
                   | PROTECTED;

             statement
                 : expression SEMICOLON
                //  |propertyAccess
                 | ifStatement
                 | loopStatement
                 | switchStatement
                 | methodDeclaration
                 | propertyDeclaration
                 | functionCall SEMICOLON
                 | IDENTIFIER EQUALS expression SEMICOLON
                 |returnStatement
                 |propertyAccess
                 |propertystatment

                 ;

            expression
                //: lambdaExpression
               // |  primaryExpression expressionRest?
                : expression PLUS expression   #  EXPPLUS
                | expression MINUS expression  # EXPMINUS
                | expression EQUALS expression  #  EXPEQUALS
                | expression LESS_THAN expression  # EXPLESS
                | expression GREATER_THAN expression   # EXPGREATER
                | expression STAR expression   #EXPSTAR
                | expression DIVIDE expression   # EXPDIVIDE
                | expression MOD expression   #  EXPMOD
                //  | arrayLiteral   #ARRAYLITERAL
                | functionCall   #FUNCTIONCALLLABEL
                | propertyAccess  # EXPPRO
                | expression PLUS_PLUS   #   EXPPLUSPLUS
                | expression MINUS_MINUS   #  EXPMINMIN
                | OPEN_PAREN expression CLOSE_PAREN   #  EXPPAREN
                | IDENTIFIER    #  EXPID
                | STRING   #   EXPSTRING
                | NUMBER    #  EXPNUMBER
                 |INTEGER   # EXPINTEGER
               ;

          propertyAccess
          : calfun  # CALFUNLABEL
          | iddot # IDDOTLABEL
          | functhis  # FUNCTHISLABEL
          ;

           calfun:THIS DOT IDENTIFIER (DOT IDENTIFIER)*;
           iddot:IDENTIFIER (DOT IDENTIFIER)+;
           functhis: THIS DOT IDENTIFIER DOT GET_PRODUCTS  OPEN_PAREN CLOSE_PAREN
            ;

               functionCall
                   : propertyAccess OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
                   | IDENTIFIER OPEN_PAREN (expression (COMMA expression)*)? CLOSE_PAREN
                   |propertyAccess OPEN_PAREN argumentList? CLOSE_PAREN
                   |propertyAccess OPEN_PAREN CLOSE_PAREN SEMICOLON;

                  selectProduct
                  : SELECTPRODUCT OPEN_PAREN parameter (COMMA parameter)* CLOSE_PAREN (':' VOID)? OPEN_CURLY statement* CLOSE_CURLY      #SELECTPRODUCTLABEL;

                argumentList
                 : expression (COMMA expression)*
                ;




                arrayLiteral
                    : OPEN_SQUARE (expression (COMMA expression)*)? CLOSE_SQUARE;

                interfaceDeclaration
                    : EXPORT? INTERFACE IDENTIFIER OPEN_CURLY interfaceBody CLOSE_CURLY;

                interfaceBody
                    : interfaceMember*;

                interfaceMember
                    : propertySignature
                    | methodSignature;

                propertySignature
                    : IDENTIFIER COLON value SEMICOLON;

                methodSignature
                    : IDENTIFIER OPEN_PAREN parameterList? CLOSE_PAREN COLON value SEMICOLON;

                parameterList
                    : parameter2 (COMMA parameter2)*;

                parameter2
                    : IDENTIFIER COLON value;

             onbutton:ONBUTTONCLICK '('')' '{' basevalue '(' expression')' ';''}' ;
             arrayvalue
                : basevalue OPEN_SQUARE CLOSE_SQUARE
                | ARRAY LESS_THAN basevalue GREATER_THAN;
            decorator
                :  OUTPUT OPEN_PAREN CLOSE_PAREN propertyAssignment SEMICOLON;

            propertyAssignment
                : IDENTIFIER EQUALS NEW IDENTIFIER (LESS_THAN value GREATER_THAN)? OPEN_PAREN CLOSE_PAREN;

            expressionList
                : expression (COMMA expression)*;

            ngOnInit
                : NGONINIT OPEN_PAREN CLOSE_PAREN COLON VOID OPEN_CURLY (expression ) CLOSE_CURLY;
            lambdaExpression
                :IDENTIFIER EQUALS'(' IDENTIFIER')' ARROW functionBody
                | OPEN_PAREN parameterList? CLOSE_PAREN ARROW functionBody
                ;

            functionBody
                : expression
                | OPEN_CURLY statement* CLOSE_CURLY
                ;
            returnStatement
                : RETURN (expressionList | expression) SEMICOLON
                    ;
            htmlElement
                    :opentag (htmlAttribute)* GREATER_THAN htmlContent* closetag
                    |opentag (htmlAttribute)* '/>'
                    |opentag CLASS EQUALS textNode GREATER_THAN htmlContent* closetag
                    |angularButton
                    |selfClosingElement
                    ;
            angularButton
                  : '<' BUTTON (IDENTIFIER)   '=' expression '>' STRING '</' BUTTON '>';

             selfClosingElement
            : '<' IDENTIFIER (htmlAttribute)* '/' GREATER_THAN
            ;
            opentag
                : '<' IDENTIFIER;

            htmlAttribute
                :IDENTIFIER EQUALS STRING
                |IDENTIFIER
                |ngfor
                |ngIf
                |eventBinding
                |angularButton
                | '[' IDENTIFIER ']' '=' expression
                | '(' IDENTIFIER ')' '=' expression
                | '[' IDENTIFIER ']'

                ;
            closetag
                : '</' IDENTIFIER '>';


            ngIf
                : '*ngIf' EQUALS expression;
           ngfor
                : '*ngFor' EQUALS expression;
            htmlContent
                : (htmlElement | textNode | interp)+;

            interp
               :identifierChain
                ;
           identifierChain
            : OPEN_DOUBLE_CURLY IDENTIFIER (DOT IDENTIFIER)* CLOSE_DOUBLE_CURLY ;
           eventBinding
             : '(' IDENTIFIER ')' '=' expression ;
           textNode
               :STRING
               |ARABIC_TEXT
               |WS
               |COLON
               |LS
               ;
