tree grammar TExpr3;

options {
  tokenVocab=Expr;

  ASTLabelType=CommonTree;

  output=template;
  superClass = TreeParserTmpl;
}

@header {
package tb.antlr.kompilator;
}

prog    : (e+=expr | d+=decl)* -> template(name={$e}, deklaracje={$d}) "<deklaracje>
<name;separator=\" aaa!!! \">";

decl : ^(VAR i1=ID) -> deklaruj(p1={$i1.text})
;

expr    : ^(PLUS  e1=expr e2=expr) -> dodaj(p1={$e1.st},p2={$e2.st})
        | ^(MINUS e1=expr e2=expr) -> odejmij(p1={$e1.st},p2={$e2.st})
        | ^(MUL   e1=expr e2=expr) -> pomnoz(p1={$e1.st},p2={$e2.st})
        | ^(DIV   e1=expr e2=expr) -> podziel(p1={$e1.st},p2={$e2.st})
        | ^(PODST i1=ID   e2=expr) 
        | INT                      -> int(i={$INT.text})
    ;
    
    
   