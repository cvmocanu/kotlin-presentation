# when
# no checked exceptions
    - "This design decision is based on the practice of using checked exceptions in Java. Experience has shown that the Java rules often requires a lot of meaningless code to rethrow or ignore the exceptions, and the rules don't consistently protect you from the errors that can happen" (Kotlin in Action, page 40)
    - you can still mention them in KDoc (javadoc for Kotlin, markdown syntax)
# throw as an expression, making for nicer code
# @Deprecated annotation with optional automatic refactoring
# functional types
- nice syntactic sugar
- working with JDK 6 (e.g. for Android)
# lambdas
# easier to understand generics
# extension functions
    - example: toTitleCase?
    - safe: you need to explicitly import them
    - syntactic sugar for utility methods (making code more readable)
    - see page 52 in the book

# show koans