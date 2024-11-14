import time

def coin_change(coins, amount):
    dp = [float("inf")] * (amount + 1)
    dp[0] = 0

    for coin in coins:
        for i in range(coin, amount + 1):
            dp[i] = min(dp[i], dp[i - coin] + 1)

    return dp[amount] if dp[amount] != float('inf') else "no solution"

def main():
    num = int(input("Enter number of coins: "))
    coins = []
    for i in range(num):
        coin = int(input("Append coin: "))
        coins.append(coin)
    amount = int(input("Enter amount: "))
    min_coins = coin_change(coins, amount)
    print("Minimum number of coins required is:", min_coins)

if __name__ == "__main__":
    start = time.time()
    main()
    end = time.time()
    print("TIME COMPLEXITY:", end - start)
