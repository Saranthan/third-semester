import java.util.Scanner;

class SimpleStack {
    public int[] stackArray;
    public int top;
    public int capacity;

    
    public SimpleStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop.");
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value);
        }
    }

    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.println("|"+stackArray[i] + "| ");
		System.out.println("---");
            }
            System.out.println();
        }
    }

    
   public boolean isEmpty() {
        return top == -1;
    }

    
    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleStack stack = new SimpleStack(5);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    break;
            }
        }
    }
}
