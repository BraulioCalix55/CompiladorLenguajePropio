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
DIGITOFLOAT = ([0-9]*[.])?[0-9]+
COMA = ,
ERROR=error
MAIN=Main
IGUAL = :=?
PUNTOCOMA = ;
PARENTESISI = "("
PARENTESISD = ")"
LLAVEIZ = "{"
LLAVEDER = "}"
SALTOLINEA = \n|\r|\n\r|\t|{ESPACIO}
AND = &
OR = "|"
OPREL = <|>|<=|>=|=
OPADICION = [+-]
OPMULTI = [*/]
IF = If
ELSE = Else
IFELSE = Ifel
THEN = Then
FOR =For
WHILE=While
SWITCH=switch
CASE=Cas
MAIN=Main
ENDCASE=EndCas
DEFINIR=Def
INT=Int
CHAR=Char
BOOLEAN=Bool
ASIGNACCION= <-
ID = {LETRA}({LETRA}|{DIGITO})*|{LETRA}({LETRA}|{DIGITO})*



%%
<YYINITIAL>{
    {IF}            {return IF;}
    {PUNTOCOMA}     {return PUNTOCOMA;}
    {COMA}          {return COMA;}
    {IGUAL}         {return IGUAL;}
    {MAIN}          {return MAIN;}
    {OR}            {return OR;}
    {DIGITO}        {return DIGITO;}
    {DIGITOFLOAT}   {return DIGITOFLOAT;}
    {PARENTESISI}   {return PARENTESISI;}
    {PARENTESISD}   {return PARENTESISD;}
    {LLAVEIZ}       {return LLAVEIZ;}
    {LLAVEDER}      {return LLAVEDER;}
    {ERROR}         {return ERROR;}
    {COMILLA}       {return COMILLA;}
    {AND}           {return AND;}
    {OPADICION}     {return OPADICION;}
    {OPREL}         {return OPREL;}
    {OPMULTI}       {return OPMULTI;}
    {ELSE}          {return ELSE;}
    {IFELSE}        {return IFELSE;}
    {THEN}          {return THEN;}
    {FOR}           {return FOR;}
    {WHILE}         {return WHILE;}
    {SWITCH}        {return SWITCH;}
    {CASE}          {return CASE;}
    {ENDCASE}       {return ENDCASE;}
    {DEFINIR}       {return DEFINIR;}
    {INT}           {return INT;}
    {CHAR}          {return CHAR;}
    {BOOLEAN}       {return BOOLEAN;}
    {ASIGNACCION}   {return ASIGNACCION;}
    {ID}            {return ID;}
    {SALTOLINEA}    {}
    {ESPACIO}       {}
    .               {}
}