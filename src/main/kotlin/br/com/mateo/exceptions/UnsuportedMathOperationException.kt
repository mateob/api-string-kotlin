package br.com.mateo.exceptions

import java.lang.RuntimeException

class UnsuportedMathOperationException(exception: String?) : RuntimeException(exception);