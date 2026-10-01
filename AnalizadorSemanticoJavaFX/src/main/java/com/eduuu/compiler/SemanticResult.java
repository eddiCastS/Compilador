package com.eduuu.compiler;

import java.util.List;

public record SemanticResult(SymbolTable symbolTable, List<SemanticError> errors) {
    public boolean isValid() { return errors.isEmpty(); }
}
