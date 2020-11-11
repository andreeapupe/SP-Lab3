package models;
import services.*;
interface Element {
    void print();
    void accept(Visitor visitor);
}