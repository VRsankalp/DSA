import random

def hangman():
    words = ["python", "hangman", "programming", "developer", "computer", "science"]
    word = random.choice(words)  
    guessed = ["_"] * len(word)  
    guessed_letters = set()  
    lives = 6                   

    print("🎯 Welcome to Hangman!")
    print("Guess the word:")
    print(" ".join(guessed))

    while lives > 0:
        guess = input("\nEnter a letter: ").lower()

        # Invalid input 
        if len(guess) != 1 or not guess.isalpha():
            print("❌ Please enter only a single alphabet.")
            continue

        # Already guessed letter
        if guess in guessed_letters:
            print("⚠ You already guessed that letter!")
            continue

        guessed_letters.add(guess)

        # If guessed letter is in the word
        if guess in word:
            print("✔ Good job! Letter found.")
            for i in range(len(word)):
                if word[i] == guess:
                    guessed[i] = guess
        else:
            lives -= 1
            print(f"❌ Wrong guess! Lives left: {lives}")

        print("\n" + " ".join(guessed))

        # Check if player wins
        if "_" not in guessed:
            print("\n🎉 Congratulations! You guessed the word:", word)
            break  
    else:
        print("\n💀 Game Over! The word was:", word)

# Run the game
hangman()
