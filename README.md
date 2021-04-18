
Part 1

Simple Parser Calculator that supports addition, subtraction, exponentation and parenthesis with an LL(1) Grammar.


Compilation instructions:
$ make compile

Execution instructions:
$ make execute

To clean up generated files:
$ make clean


Grammar:

expr -> term expr2

expr2 -> + term expr2
        | - term expr2
        | ε

term -> factor term2

term2 -> ** factor term2
        | ε

factor -> start_num 
        | (expr)

op -> +
    | -
    | **

start_num -> first_digit moreDigits
            | 0

num -> moreDigits

moreDigits -> num
            | ε

digit -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

first_digit -> 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9



Part 2

Compilation instructions:
$ make compile

Execution instructions:
$ make execute

To cleanup generated files:
$ make clean


Parser and translator for a simple language supporting string operations.

The language supports the concatenation (+) operator over strings, function definitions and calls, conditionals (if-else, every "if" must be followed by an "else"), and the logical expressions:
    is-prefix-of (string1 prefix string2): Whether string1 is a prefix of string2.
    is-suffix-of (string1 suffix string2): Whether string1 is a suffix of string2.



The program receives the input and outputs the java program both in the standard output and in a file named Main.java.

A function declaration and the main program need to have at least one argument to be valid.

Function and main expressions are separated, so that variables <ID> are valid only in the functions.
        
An if expression can only include a logical expression <PREFIX, SUFFIX> or a second if expression, however complicated.

Declarations of functions must precede the main program.

In function declarations the arguments must be <ID>s.
        
In function calls the arguments can be any expression but <ID>s.         
        
