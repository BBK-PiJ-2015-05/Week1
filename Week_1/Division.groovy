/*
* 6: Division
* divides two absolute integers input by the user
* controls for division by zero
*/

System.out.println("Please enter a number.")
String strOne = System.console().readLine()
int firstNum = Integer.parseInt(strOne).abs()

System.out.println("Please enter another number.")
String strTwo = System.console().readLine()
int secNum = Integer.parseInt(strTwo).abs()
if(firstNum == 0 || secNum == 0){
    System.out.println"Cannot divide by zero"
}else{
    int remainder = firstNum
    int i = 0
    while(remainder >= secNum){
        remainder -= secNum
        i++
    }

	System.out.println"The number " + firstNum + " divided by " + secNum + " is equal to " + i + " remainder " + remainder
}