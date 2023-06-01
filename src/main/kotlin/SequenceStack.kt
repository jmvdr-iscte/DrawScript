
data class SequenceStack(
    val interpreter: Interpreter,
    var elements: MutableList<SequenceIterator>
) {

    fun push(newIterator: SequenceIterator) {
        elements.add(0,newIterator)
    }

    fun pop(): SequenceIterator? {
        if (elements.isEmpty()) {
            return null
        }
        return elements.removeAt(elements.lastIndex)
    }
}