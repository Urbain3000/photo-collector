//package com.urbain.photocollector.entities;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//public class ImageEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "image_id")
//    private Long imageId;
//
//    @Column(nullable = false)
//    private Long nom;
//
//    @Column(nullable = false)
//    private Long url;
//
//    @Column(length = 8, nullable = false)
//    private int hauteur;
//
//    @Column(length = 8, nullable = false)
//    private int largeur;
//
//
//    @ManyToOne
//    private ArticleEntity article;
//}
