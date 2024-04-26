package interfaces;

import classes.Item;

public interface ITransaction{
    void startTransaction();
    void addItem(Item item);
    void finalizeTransaction();

}
