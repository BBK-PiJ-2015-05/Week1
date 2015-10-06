/*
* 10: You said high, I said low...
* tests the numbers to see if they are increasing or decreasing sequentially
*/
System.out.print("Please enter a number: ")
String str = System.console().readLine()
int prevNum = Integer.parseInt(str)
int nextNum = 0
boolean isInOrder = true
if (prevNum != -1){
    while (nextNum != -1) {
        System.out.print("Please enter another number (enter -1 to break): ")
        String strTwo = System.console().readLine()
        nextNum = Integer.parseInt(strTwo)
        
        if(nextNum != -1){
            if(nextNum !=(prevNum + 1) && nextNum !=(prevNum - 1))
            {
              isInOrder = false
            }
            prevNum = nextNum
        }
    }
    if(isInOrder){
        System.out.println("Yes")
    }else{
        System.out.println("No")
    }
} else {
    System.out.println("You did not enter any valid numbers.\nPlease try again.")
}