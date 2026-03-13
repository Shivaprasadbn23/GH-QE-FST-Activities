import random

while True:

    user = input("Enter rock, paper, or scissors: ").lower()

    choices = ["rock", "paper", "scissors"]
    computer = random.choice(choices)

    print("Computer chose:", computer)

    if user == computer:
        print("It's a tie!")

    elif (user == "rock" and computer == "scissors") or \
         (user == "paper" and computer == "rock") or \
         (user == "scissors" and computer == "paper"):
        print("You win!")

    else:
        print("Computer wins!")

    play_again = input("Do you want to play again? (Yes/No): ").lower()

    if play_again != "yes":
        print("Game ended")
        break