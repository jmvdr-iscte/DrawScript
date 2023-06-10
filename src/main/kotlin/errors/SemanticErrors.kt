package errors

open class SemanticErrors(
    message: String?, cause: Throwable?,

    ) : Exception(message, cause)


class InvalidColorParameter(
    message: String?, cause: Throwable?,
) : SemanticErrors(message, cause)

class DuplicateConstant(
    message: String?, cause: Throwable?,
) : SemanticErrors(message, cause)

class WrongReference(
    message: String?, cause: Throwable?,
) : SemanticErrors(message, cause)