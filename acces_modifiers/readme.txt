There are two types of modifiers in java: access modifiers and non-access modifiers.

The access modifiers in java specifies accessibility (scope) of a data member, method, constructor or class.

There are 4 types of java access modifiers:

private
default
protected
public


private access modifier

The private access modifier is accessible only within class.

Simple example of private access modifier:- we have created two classes A and Simple. A class contains private data member and private method. We are accessing these private members from outside the class, so there is compile time error.


 default access modifier

If you don't use any modifier, it is treated as default bydefault. The default modifier is accessible only within package.
Example of default access modifier

In this example, we have created two packages pack and mypack. We are accessing the A class from outside its package, since A class is not public, so it cannot be accessed from outside the package.
