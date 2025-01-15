-module(calc).
-export([start/0, perform_operation/2]).

start() ->
    io:format("Select an operation:~n"),
    io:format("1. Addition (+)~n"),
    io:format("2. Subtraction (-)~n"),
    io:format("3. Multiplication (*)~n"),
    io:format("4. Division (/)~n"),
    io:format("Enter your choice (1-4): "),
    Choice = list_to_integer(io:get_line("")),
    io:format("Enter the first number: "),
    Num1 = list_to_integer(io:get_line("")),
    io:format("Enter the second number: "),
    Num2 = list_to_integer(io:get_line("")),
    perform_operation(Choice, Num1, Num2).

perform_operation(1, Num1, Num2) ->
    Result = Num1 + Num2,
    io:format("The result of addition is: ~p~n", [Result]);
perform_operation(2, Num1, Num2) ->
    Result = Num1 - Num2,
    io:format("The result of subtraction is: ~p~n", [Result]);
perform_operation(3, Num1, Num2) ->
    Result = Num1 * Num2,
    io:format("The result of multiplication is: ~p~n", [Result]);
perform_operation(4, Num1, Num2) when Num2 /= 0 ->
    Result = Num1 / Num2,
    io:format("The result of division is: ~p~n", [Result]);
perform_operation(4, _, 0) ->
    io:format("Error: Division by zero is not allowed.~n");
perform_operation(_, _, _) ->
    io:format("Invalid choice.~n").
