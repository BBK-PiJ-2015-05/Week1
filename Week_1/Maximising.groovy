/*
* 8: Maximising
* calculates the highest number entered by a user
*/
System.out.print("Please enter a number: ")
String str = System.console().readLine()
int max = Integer.parseInt(str)
int num = 0
if (max != -1){
    while (num !=-1) {
        System.out.print("Please enter another number (enter -1 to break) ")
        String strTwo = System.console().readLine()
        num = Integer.parseInt(strTwo)
        if(num > max)
        {
          max = num
        }
    }
    System.out.println("The highest number entered was " + max)
} else {
    System.out.println("You did not enter any valid numbers.\nPlease try again.")
}