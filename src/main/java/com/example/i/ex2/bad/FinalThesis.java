package com.example.i.ex2.bad;

public class FinalThesis implements FileExport{
    @Override
    public void exportCSV() { // estamos obligados a implementarlo aunque no nos haga falta
        throw new UnsupportedOperationException();
    }

    @Override
    public void exportPDF() {
        System.out.println("Im PDF!");
    }

    @Override
    public void exportDocx() {
        System.out.println("Im Doc!");
    }
}
