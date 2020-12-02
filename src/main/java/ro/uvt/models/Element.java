package ro.uvt.models;

interface Element {
    void print();
    void accept(Visitor visitor);
}