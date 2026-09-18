case PLUS:
  if (left instanceof String || right instanceof String) {
    return stringify(left) + stringify(right);
  }

  if (left instanceof Double && right instanceof Double) {
    return (double)left + (double)right;
  }

  throw new RuntimeError(expr.operator,
      "Operands must be two numbers or two strings.");
