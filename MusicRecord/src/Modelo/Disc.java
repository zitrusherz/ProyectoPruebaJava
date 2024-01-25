/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author chris
 */
public class Disc {
    private String discName;
    private String artistName;
    private String discType;
    private LocalDate releaseDate;
    private int numberOfSongs;
    private int price;
    private int stock;

    public Disc(String discName, String artistName, String discType, LocalDate releaseDate, int numberOfSongs, int price, int stock) {
        this.discName = discName;
        this.artistName = artistName;
        this.discType = discType;
        this.numberOfSongs = numberOfSongs;
        this.releaseDate = releaseDate;
        this.price = price;
        this.stock = stock;
    }
    
}
