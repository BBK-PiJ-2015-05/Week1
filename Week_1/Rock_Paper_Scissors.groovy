/*
* 16. Rock, Paper, Scissors
* takes input from the user and determines a score based off of rock, paper, scissors
*/
int player1 = 0
int player2 = 0

while((player1 - player2).abs() != 3){
    String move = ""
    while(move.length() !=2){
        print "What did player 1 and player 2 choose as their moves? (PP, PR, PS, RP, RR, RS, SR, SS): "
        move = System.console().readLine().toUpperCase()
    }
    
    if(move.charAt(0) == move.charAt(1)){
        println"It's a tie!"
    }else if(move.charAt(0) == "S"){
        if(move.charAt(1) == "P"){
            println"Scissors beat paper!"
            player1++
        }else{
            println"Rock beats scissors!"
            player2++
        }
    }else if(move.charAt(0) == "P"){
        if(move.charAt(1) == "S"){
            println"Scissors beat paper!"
            player2++
        }else{
            println"Paper beats rock!"
            player1++
        }
    }else if(move.charAt(0) == "R"){
        if(move.charAt(1) == "S"){
            println"Rock beats scissors!"
            player1++
        }else{
            println"Paper beats rock!"
            player2++
        }
    }
}
if(player1 > player2){
    println"Player 1 wins!"
}else{
    println"Player 1 wins!"
}