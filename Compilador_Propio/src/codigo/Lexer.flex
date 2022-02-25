package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
%{
    public String lexeme;
%}
LETRA = [a-zA-Z]
DIGITO = [0-9]+
ESPACIO = [" "]
COMILLA = \"
COMENTARIOA= "*-"
COMENTARIOC= "-*"
COMENTARIOSI="~~"
DIGITOFLOAT = ([0-9]*[.])?[0-9]+
COMA = ,
ERROR=Error
MAIN=Main
IGUAL = :=?
PUNTOCOMA = ;
PARENTESISI = "("
PARENTESISD = ")"
LLAVEIZ = "{"
LLAVEDER = "}"
SALTOLINEA = \n|\r|\n\r|\t|{ESPACIO}
SALTO=\n
COMPARACION= "=?"
AND = &
OR = "|"
OPREL = <|>|<=|>=|=
OPADICION = [+-]
OPMULTI = [*/]
IF = If
ELSE = Else
THEN = Then
FOR =For
WHILE=While
SWITCH=Switch
CASE=Cas
MAIN=Main
ENDCASE=EndCas
DEFINIR=Def
INT=Int
CHAR=Char
IMPRIMIR=Sout
BOOLEAN=Bool
ASIGNACCION= <--
ID = {LETRA}({LETRA}|{DIGITO})*|{LETRA}({LETRA}|{DIGITO})*

%state COMENTARIOSIM
%state COMENTARIOPARR


%%
<YYINITIAL>{
    // la posicion es con yyline+1 y yycolumn+1
    {IF}            {lexeme=yytext();return IF;}
    {PUNTOCOMA}     {lexeme=yytext();return PUNTOCOMA;}
    {COMPARACION}   {lexeme=yytext();return COMPARACION;}
    {COMA}          {lexeme=yytext();return COMA;}
    {IGUAL}         {lexeme=yytext();return IGUAL;}
    {MAIN}          {lexeme=yytext(); return MAIN;}
    {OR}            {lexeme=yytext(); return OR;}
    {IMPRIMIR}      {lexeme=yytext(); return IMPRIMIR;}
    {DIGITO}        {lexeme=yytext(); return DIGITO;}
    {DIGITOFLOAT}   {lexeme=yytext(); return DIGITOFLOAT;}
    {PARENTESISI}   {lexeme=yytext(); return PARENTESISI;}
    {PARENTESISD}   {lexeme=yytext(); return PARENTESISD;}
    {LLAVEIZ}       {lexeme=yytext(); return LLAVEIZ;}
    {LLAVEDER}      {lexeme=yytext(); return LLAVEDER;}
    {ERROR}         {lexeme=yytext(); return ERROR;}
    {COMILLA}       {lexeme=yytext(); return COMILLA;}
    {AND}           {lexeme=yytext(); return AND;}
    {OPADICION}     {lexeme=yytext(); return OPADICION;}
    {OPREL}         {lexeme=yytext(); return OPREL;}
    {OPMULTI}       {lexeme=yytext(); return OPMULTI;}
    {ELSE}          {lexeme=yytext(); return ELSE;}
    {THEN}          {lexeme=yytext(); return THEN;}
    {FOR}           {lexeme=yytext(); return FOR;}
    {WHILE}         {lexeme=yytext(); return WHILE;}
    {SWITCH}        {lexeme=yytext(); return SWITCH;}
    {CASE}          {lexeme=yytext(); return CASE;}
    {ENDCASE}       {lexeme=yytext(); return ENDCASE;}
    {DEFINIR}       {lexeme=yytext(); return DEFINIR;}
    {INT}           {lexeme=yytext(); return INT;}
    {CHAR}          {lexeme=yytext(); return CHAR;}
    {BOOLEAN}       {lexeme=yytext(); return BOOLEAN;}
    {ASIGNACCION}   {lexeme=yytext(); return ASIGNACCION;}
    {ID}            {lexeme=yytext(); return ID;}
    {SALTOLINEA}    {}
    {ESPACIO}       {}
    {COMENTARIOA} {yybegin(COMENTARIOPARR);}    
    {COMENTARIOSI}  {yybegin(COMENTARIOSIM);}
    .               {return ERROR;}
}
<COMENTARIOPARR>{
    {COMENTARIOC}   {yybegin(YYINITIAL);}
    .                   {}
}
<COMENTARIOSIM>{
    {SALTO}    {yybegin(YYINITIAL);}
    .               {}
}
