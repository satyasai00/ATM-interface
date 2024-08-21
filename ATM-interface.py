class ATM:
    def __init__(self):
        self.pin = 8126
        self.balance = 200000
        self.withdrawn_amount = 0
        self.deposited_amount = 0
        self.transferred_amount = 0

    def authenticate(self):
        entered_pin = int(input("Please enter your ATM pin: "))
        if entered_pin == self.pin:
            return True
        else:
            print("Incorrect pin. Please try again.")
            return False

    def withdraw(self):
        amount = int(input("Enter money to withdraw: "))
        if self.balance >= amount:
            self.balance -= amount
            self.withdrawn_amount += amount
            print(f"Please collect your money. Available balance is {self.balance}\n")
        else:
            print("Insufficient funds.\n")

    def deposit(self):
        amount = int(input("Enter money to deposit: "))
        self.balance += amount
        self.deposited_amount += amount
        print("Your money has been successfully deposited.\n")

    def check_balance(self):
        print(f"Available Balance: {self.balance}\n")

    def transfer(self):
        ifsc_code = input("Enter the IFSC code: ")
        account_number = input("Enter the Bank Account Number: ")
        amount = int(input("Enter the amount to transfer: "))
        if self.balance >= amount:
            self.balance -= amount
            self.transferred_amount += amount
            print(f"Your amount {amount} has been successfully transferred to account number {account_number}.")
            print(f"Available Balance: {self.balance}\n")
        else:
            print("Insufficient funds.\n")

    def receipt(self):
        print("Transaction Receipt")
        print(f"Deposited amount: {self.deposited_amount}")
        print(f"Withdrawn amount: {self.withdrawn_amount}")
        print(f"Transferred amount: {self.transferred_amount}")
        print(f"Available balance: {self.balance}\n")
        print("Thank you for using our service. Visit again!\n")

    def exit(self):
        print("Thank you for using the ATM. Visit again!")
        quit()

    def run(self):
        if not self.authenticate():
            return

        while True:
            print("BOI Bank ATM")
            print("1. Withdraw")
            print("2. Deposit")
            print("3. Check Balance")
            print("4. Transfer")
            print("5. Receipt")
            print("6. Exit")

            choice = int(input("Enter your choice: "))

            if choice == 1:
                self.withdraw()
            elif choice == 2:
                self.deposit()
            elif choice == 3:
                self.check_balance()
            elif choice == 4:
                self.transfer()
            elif choice == 5:
                self.receipt()
            elif choice == 6:
                self.exit()
            else:
                print("Invalid choice. Please try again.\n")


if __name__ == "__main__":
    atm = ATM()
    atm.run()
