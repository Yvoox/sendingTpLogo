     
%%
   
%package hassen.logo.interpreter
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }

frame			{ return getSymbolFactory().newSymbol ("FRAME", Sym.FRAME); }
home			{ return getSymbolFactory().newSymbol ("HOME", Sym.HOME); }
up				{ return getSymbolFactory().newSymbol ("UP", Sym.UP); }
down			{ return getSymbolFactory().newSymbol ("DOWN", Sym.DOWN); }
left			{ return getSymbolFactory().newSymbol ("LEFT", Sym.LEFT); }
right			{ return getSymbolFactory().newSymbol ("RIGHT", Sym.RIGHT); }
pen				{ return getSymbolFactory().newSymbol ("PEN", Sym.PEN); }
turn			{ return getSymbolFactory().newSymbol ("TURN", Sym.TURN); }
move			{ return getSymbolFactory().newSymbol ("MOVE", Sym.MOVE); }
goto			{ return getSymbolFactory().newSymbol ("GOTO", Sym.GOTO); }
on				{ return getSymbolFactory().newSymbol ("ON", Sym.ON); }
off				{ return getSymbolFactory().newSymbol ("OFF", Sym.OFF); }
plot			{ return getSymbolFactory().newSymbol ("PLOT", Sym.PLOT); }
ink				{ return getSymbolFactory().newSymbol ("INK", Sym.INK); }

"="				{ return getSymbolFactory().newSymbol ("SET", Sym.SET); }
"+"				{ return getSymbolFactory().newSymbol ("ADD", Sym.ADD); }
"-"				{ return getSymbolFactory().newSymbol ("SUB", Sym.SUB); }
"*"				{ return getSymbolFactory().newSymbol ("MULT", Sym.MULT); }
"/"				{ return getSymbolFactory().newSymbol ("DIV", Sym.DIV); }
"("				{ return getSymbolFactory().newSymbol ("OPEN", Sym.OPEN_PARENTHESIS); }
")"				{ return getSymbolFactory().newSymbol ("CLOSE", Sym.CLOSE_PARENTHESIS); }

","				{ return getSymbolFactory().newSymbol ("SEP", Sym.SEP); }
";"				{ return getSymbolFactory().newSymbol ("SEP", Sym.TERM); }

[0-9]+			{ return getSymbolFactory().newSymbol ("NUMBER", Sym.NUMBER, Integer.valueOf(yytext())); }

[a-zA-Z][a-zA-Z_0-9]*	{ return getSymbolFactory().newSymbol ("ID", Sym.ID, yytext()); }

\"[^\"]*\"		{ return getSymbolFactory().newSymbol ("TEXT", Sym.TEXT, new String( zzBuffer, zzStartRead+1, zzMarkedPos-zzStartRead-2 )); }

[^]                    { throw new Error("Illegal character <"+yytext()+">"); }
