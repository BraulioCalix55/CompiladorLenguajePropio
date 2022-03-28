package codigo;
import java_cup.runtime.Symbol;
import java.util.ArrayList;
%%
%unicode
%class LexerCup
%cup
%line
%column
%state COMENTARIOSIM

%{
    public String lexeme;
    String comentario="";
    String cadena="";
    ArrayList erroresLexicos = new ArrayList();
%}
LETRA = [a-zA-Z]
DIGITO = [0-9]+
ESPACIO = [" "]
COMILLA = \"
COMENTAR= "~~"
DIGITOFLOAT = ([0-9]*[.])?[0-9]+
COMA = ","
MAIN=Main
IGUAL = "?="
DOSPUNTOS= "::"
PARENTESISI = "("
PARENTESISD = ")"
LLAVEIZ = "{"
LLAVEDER = "}"

SALTOLINEA = \n|\r|\n\r|\t|{ESPACIO}
AND = &
OR = "|"
OPREL = <|>|<=|>=|=
FUNCION=Fun
OPADICION = [+-]
OPMULTI = [*/]
IF = "If"
VBOOLTRUE= TRUE
VBOOLFALSE= FALSE
FOR =For
WHILE=While
SWITCH=Switch
VOID=Vd
CASE=Cas
ENDCASE=EndCas
DEFAULT=Def
INT=Int
CHAR=Char
IMPRIMIR=Sout
RETURN=Return
BOOLEAN=Bool
ASIGNACCION= <--
ID = {LETRA}({LETRA}|{DIGITO})*|{LETRA}({LETRA}|{DIGITO})*
%%

<YYINITIAL>{
    {IF}            {return new Symbol(sym.TKN_IF           ,yyline+1 ,yycolumn+1 ,yytext());}
    {AND}           {return new Symbol(sym.TKN_AND          ,yyline+1 ,yycolumn+1 ,yytext());}
    {VBOOLTRUE}     {return new Symbol(sym.TKN_TRUE         ,yyline+1 ,yycolumn+1 ,yytext());}
    {VBOOLFALSE}    {return new Symbol(sym.TKN_FALSE        ,yyline+1 ,yycolumn+1 ,yytext());}
    {DOSPUNTOS}     {return new Symbol(sym.TKN_DOSPUNTOS    ,yyline+1 ,yycolumn+1 ,yytext());}
    {VOID}          {return new Symbol(sym.TKN_VOID         ,yyline+1 ,yycolumn+1 ,yytext());}
    {RETURN}        {return new Symbol(sym.TKN_RETURN       ,yyline+1 ,yycolumn+1 ,yytext());}
    {FUNCION}       {return new Symbol(sym.TKN_FUNCION      ,yyline+1 ,yycolumn+1 ,yytext());}
    {COMA}          {return new Symbol(sym.TKN_COMA         ,yyline+1 ,yycolumn+1 ,yytext());}
    {IGUAL}         {return new Symbol(sym.TKN_IGUAL        ,yyline+1 ,yycolumn+1 ,yytext());}
    {MAIN}          {return new Symbol(sym.TKN_MAIN         ,yyline+1 ,yycolumn+1 ,yytext());}
    {OR}            {return new Symbol(sym.TKN_OR           ,yyline+1 ,yycolumn+1 ,yytext());}
    {IMPRIMIR}      {return new Symbol(sym.TKN_IMPRIMIR     ,yyline+1 ,yycolumn+1 ,yytext());}
    {DIGITO}        {return new Symbol(sym.TKN_DIGITO       ,yyline+1 ,yycolumn+1 ,yytext());}
    {DIGITOFLOAT}   {return new Symbol(sym.TKN_DIGITOFLOAT  ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISI}   {return new Symbol(sym.TKN_PARENTESISI  ,yyline+1 ,yycolumn+1 ,yytext());}
    {LETRA}         {return new Symbol(sym.TKN_LETRA        ,yyline+1 ,yycolumn+1 ,yytext());}
    {PARENTESISD}   {return new Symbol(sym.TKN_PARENTESISD  ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEIZ}       {return new Symbol(sym.TKN_LLAVEIZ      ,yyline+1 ,yycolumn+1 ,yytext());}
    {LLAVEDER}      {return new Symbol(sym.TKN_LLAVEDER     ,yyline+1 ,yycolumn+1 ,yytext());}
    {COMILLA}       {return new Symbol(sym.TKN_COMILLA      ,yyline+1 ,yycolumn+1 ,yytext());}
    {OPADICION}     {return new Symbol(sym.TKN_OPADICION    ,yyline+1 ,yycolumn+1 ,yytext());}
    {OPREL}         {return new Symbol(sym.TKN_OPREL        ,yyline+1 ,yycolumn+1 ,yytext());}
    {OPMULTI}       {return new Symbol(sym.TKN_MULTI        ,yyline+1 ,yycolumn+1 ,yytext());}
    {FOR}           {return new Symbol(sym.TKN_FOR          ,yyline+1 ,yycolumn+1 ,yytext());}
    {WHILE}         {return new Symbol(sym.TKN_WHILE        ,yyline+1 ,yycolumn+1 ,yytext());}
    {SWITCH}        {return new Symbol(sym.TKN_SWITCH       ,yyline+1 ,yycolumn+1 ,yytext());}
    {CASE}          {return new Symbol(sym.TKN_CASE         ,yyline+1 ,yycolumn+1 ,yytext());}
    {ENDCASE}       {return new Symbol(sym.TKN_ENDCASE      ,yyline+1 ,yycolumn+1 ,yytext());}
    {DEFAULT}       {return new Symbol(sym.TKN_DEFAULT      ,yyline+1 ,yycolumn+1 ,yytext());}
    {INT}           {return new Symbol(sym.TKN_INT          ,yyline+1 ,yycolumn+1 ,yytext());}
    {CHAR}          {return new Symbol(sym.TKN_CHAR         ,yyline+1 ,yycolumn+1 ,yytext());}
    {BOOLEAN}       {return new Symbol(sym.TKN_BOOLEAN      ,yyline+1 ,yycolumn+1 ,yytext());}
    {ASIGNACCION}   {return new Symbol(sym.TKN_ASIGNACCION  ,yyline+1 ,yycolumn+1 ,yytext());}
    {ID}            {return new Symbol(sym.TKN_ID           ,yyline+1 ,yycolumn+1 ,yytext());}
    {SALTOLINEA}    {}
    {COMENTAR}      {yybegin(COMENTARIOSIM);}
    .               { erroresLexicos.add("Error lexico en linea: "+ (yyline+1) +" y columna " + (yycolumn+1) +" y en el texto: "+yytext()); }
}

<COMENTARIOSIM>{
    .          {}
    {SALTOLINEA}   {yybegin(YYINITIAL);}
    
     
}

