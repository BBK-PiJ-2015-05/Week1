/*
* 5: Multiplication
*users are prompted for two integers and the absolute value of them are multiplied
*/

System.out.println("Please enter a number.")
String strOne = System.console().readLine()
int firstNum = Integer.parseInt(strOne).abs()

System.out.println("Please enter another number.")
String strTwo = System.console().readLine()
int secNum = Integer.parseInt(strTwo).abs()
int result = 0

for(int i = 0; i < secNum; i++){
	result += firstNum
}

System.out.println"The number " + firstNum + " multiplied by " + secNum + " is equal to " + result
