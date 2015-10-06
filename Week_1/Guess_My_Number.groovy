/*
* 15. Guess my number
* generates a random number and tells a user if they have guessed correctly or if it's higher or lower
*/

int guess = 0
int guesses = 0
int myNum = Math.abs(new Random().nextInt() % 1000 + 1)
println "Try to guess my number!"

while(guess != myNum){
    //test for valid number
    print "Tell me a number: "
    String guessStr = System.console().readLine()
    while(!guessStr.isInteger()){
        println "Please enter a valid number"
    }
    guess  = Integer.parseInt(guessStr)

    if(guess > myNum){
        println"No! My number is lower."
    }else{
        println"No! My number is higher."
    }
    guesses++
}
println "CORRECT!"
println "You needed " + guesses + " guesses."