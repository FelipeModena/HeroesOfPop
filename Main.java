class Main {
    public static void main(String[] args) {

        gameMenu();

    }

    private static void gameMenu() {
        int gameSelected = 0;
        switch (gameSelected) {
            case 0:
                GameEngine gameEngine = new GameEngine();
                gameEngine.startGameLayout();
                break;

            default:
            System.out.println("Opção inválida");
                break;
        }
    }
}