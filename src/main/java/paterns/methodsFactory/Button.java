package paterns.methodsFactory;

public interface Button {
    void render();
    void onClick();
}
class WindowsButton implements Button {

    @Override
    public void render() {
        // Отрисовать кнопку в стиле Windows.
    }

    @Override
    public void onClick() {
// Навесить на кнопку обработчик событий Windows.
    }
}