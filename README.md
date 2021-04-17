Kanellaki Maria-Anna - 1115201400060
Compilers - Project 1


Part 1

I edited the grammar to become LL(1) and separated ** operation from +- (term2 and exp2) to achieve different 
functionality and priority. +- are prioritized from the left to the right and is always calculated at that time, while ** 
is calculated from the right to the left, only if there is another ** next. I achieved the right to left priority by adding
a list in the class which stores all numbers that aren't calculated immediately. Everything in this list is calculated
when there are no more ** next. I also seperated number in many rules, to forbid the usage of <0> as the first digit and
keep the LL(1) property at the same time.


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


