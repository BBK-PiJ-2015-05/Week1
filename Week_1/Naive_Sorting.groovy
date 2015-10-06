/*
* 7: Naive sorting
* three integers input by the user are sorting in ascending order
*/
int highest
int middle
int lowest

System.out.println("Please enter a number.")
String strOne = System.console().readLine()
int firstNum = Integer.parseInt(strOne).abs()

System.out.println("Please enter another number.")
String strTwo = System.console().readLine()
int secNum = Integer.parseInt(strTwo).abs()

System.out.println("Please enter a third number.")
String strThree = System.console().readLine()
int thirdNum = Integer.parseInt(strThree).abs()

if( firstNum > secNum){
    if(firstNum > thirdNum){
        highest = firstNum
        if (secNum > thirdNum){
            middle = secNum
            lowest = thirdNum
        }else{
            middle = thirdNum
            lowest = secNum
        }
    } else {
        highest = thirdNum
        middle = firstNum
        lowest = secNum
        
    }
}else{
    if(firstNum > thirdNum){
        highest = secNum
        middle = firstNum
        lowest = thirdNum
    }else{
        lowest = firstNum
        if(secNum > thirdNum){
            highest = secNum
            middle = thirdNum
        }else{
            highest = thirdNum
            middle = secNum
        }
    }
}

System.out.println "The numbers in order are " + lowest + " " + middle + " " + highest