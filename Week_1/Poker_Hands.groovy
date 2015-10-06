/*
* 11: Poker hands
* takes 5 integers and suits from the user.
* orders the cards then tests to see if they have a full house, etc.
*/

//read five cards (rank and suit)
class Card {
    int rank
    String suit
}

def one = new Card()
one = getCard(one)
def two = new Card()
two = getCard(two)
def three = new Card()
three = getCard(three)
def four = new Card()
four = getCard(four)
def five = new Card()
five = getCard(five)

List <Card> hand = [one, two, three, four, five]
hand.sort{it.rank}
println("Your hand:")
for( Card card : hand){
    print(card.getRank() + " ")
    println(card.getSuit())
}

println(testHand(hand))

//prompts the user for a card
Card getCard(Card cardObj){
    cardObj.rank = 0
    print("Please enter a card rank (1-10, J, Q, K): ")
    stringRank = System.console().readLine().toUpperCase()
    switch(stringRank){
        case "J"    : cardObj.rank = 11
                        break
        case "Q"    : cardObj.rank = 12
                        break
        case "K"    : cardObj.rank = 13
                        break
    }
    if (stringRank.isInteger()){
            cardObj.rank = Integer.parseInt(stringRank)
    }
    while(!isValidRank(cardObj.rank)){
        print("Please try again and enter a card rank (1-10, J, Q, K): ")
        stringRank = System.console().readLine().toUpperCase()
        
        switch(stringRank){
        case "J"    : cardObj.rank = 11
                        break
        case "Q"    : cardObj.rank = 12
                        break
        case "K"    : cardObj.rank = 13
                        break
        }
        if (stringRank.isInteger()){
            cardObj.rank = Integer.parseInt(stringRank)
        }
    }
    print("Please enter a card suit (spades, hearts, diamonds, clubs): ")
    cardObj.suit = System.console().readLine().toUpperCase()
    while(!isValidSuit(cardObj.suit)){
        print("Please try again and enter a card suit (spades, hearts, diamonds, clubs): ")
        cardObj.suit = System.console().readLine().toUpperCase()
    }
    return cardObj
}
//ensure they are valid before accepting the next one
boolean isValidRank(int rank){
        if (rank > 0 && rank <= 13){
            return true
        } else{
            return false
        }
}
boolean isValidSuit(String suit){
    if(suit == "SPADES" || suit == "HEARTS" || suit == "DIAMONDS" || suit == "CLUBS"){
        return true
    } else{
        return false
    }
}
//checks if they produce a flush
boolean isFlush (String one, String two, String three, String four, String five){
    if (one == two && one == three && one == four && one == five){
        return true
    } else {
        return false
    }
}
//checks if they are sequential
boolean isStraight (int one, int two, int three, int four, int five){
    if((one - two == -1) && (one - three == -2) && (one - four == -3) && (one - five == -4)){
        return true
    }else{
        return false
    }
}
//test for hand
String testHand (List <Card> hand){
    String result = null
    int pair = 0
    boolean triplet = false
    boolean quad = false
    //count number of duplicates
    for (int j = 1; j <= 13; j++){
    int count = 0
        for (int i = 0; i < 5; i++){
            if (hand[i].getRank() == j){
                count++
            }
        }
        if (count == 4){
            quad = true
        }else if (count == 3){
            triplet = true
        }else if (count == 2){
            pair++
        }            
    }
    if((isFlush(hand[0].getSuit(), hand[1].getSuit(), hand[2].getSuit(), hand[3].getSuit(), hand[4].getSuit())) && (isStraight(hand[0].getRank(), hand[1].getRank(), hand[2].getRank(), hand[3].getRank(), hand[4].getRank()))){
        result = "Congratulations you have a straight flush!"
    }else if(quad){
        result = "Congratulations you have a four of a kind!"
    }else if (triplet && (pair == 1)){
        result = "Congratulations you have a full house!"
    }else if (isFlush(hand[0].getSuit(), hand[1].getSuit(), hand[2].getSuit(), hand[3].getSuit(), hand[4].getSuit())){
       result = "Congratulations you have a flush!"
    }else if(isStraight(hand[0].getRank(), hand[1].getRank(), hand[2].getRank(), hand[3].getRank(), hand[4].getRank())){
        result = "Congratulations you have a straight!"
    }else if(triplet){
        result = "Wow! you got three of a kind!"
    }else if (pair == 2){
        result = "Wow! you got two pairs."
    }else if (pair == 1){
        result = "Good job you got a pair."
    }else{
        result = "Sorry you have nothing."
    }
    return result
}