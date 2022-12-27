package com.example.i.ex2.bad;

public class EarningsReport implements FileExport{
    @Override
    public void exportCSV() {
        System.out.println("Earnings in CSV!");
    }

    @Override
    public void exportPDF() { // estamos obligados a implementarlo aunque no nos haga falta
        throw new UnsupportedOperationException();
    }

    @Override
    public void exportDocx() { // estamos obligados a implementarlo aunque no nos haga falta
        throw new UnsupportedOperationException();
    }
}