package com.eduuu.compiler;

import com.eduuu.compiler.Ast.DataType;

public record Symbol(String name, DataType type, int declarationLine) {}
