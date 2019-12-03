package com.greenloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenloan.dao.GreenLabelRepository;
import com.greenloan.model.GreenLabel;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    GreenLabelRepository labelrepository;

    GreenLabel FSC = new GreenLabel();
    GreenLabel AquaCulture = new GreenLabel();
    GreenLabel AsureQuality = new GreenLabel();
    GreenLabel AvoGreen = new GreenLabel();
    GreenLabel BASTA = new GreenLabel();
    GreenLabel Certfor = new GreenLabel();

    public void addLabels() {
        FSC.setName("FSC");
        FSC.setDescription("The Forest Stewardship Council® (FSC) promotes environmentally appropriate, socially beneficial, and economically viable management of the world's forests.");
        labelrepository.save(FSC);

        AquaCulture.setName("Aquaculture Stewardship Council");
        AquaCulture.setDescription("The Aquaculture Stewardship Council (ASC) offers standards for aquaculture and for the seafood chain of custody. ");
        labelrepository.save(AquaCulture);

        AvoGreen.setName("AvoGreen®");
        AvoGreen.setDescription("AvoGreen® is a Pest Monitoring programme with an auditable avocado production system based on the principles of Integrated Pest Management (IPM).");
        labelrepository.save(AvoGreen);
        
        AsureQuality.setName("AsureQuality Organic Standard");
        AsureQuality.setDescription("The AsureQuality Organic Standard is based on internationally recognised guidelines and is accredited by the International Federation of Organic Agriculture Movements (IFOAM).");
        labelrepository.save(AsureQuality);
        
        BASTA.setName("BASTA");
        BASTA.setDescription("The BASTA system focuses on hazardous substances in construction and building products. Products are assessed according their chemical ingredients. ");
        labelrepository.save(BASTA);
        
        Certfor.setName("Certfor");
        Certfor.setDescription("Administrator of the Chilean Sustainable Forest Management Certification System.");
        labelrepository.save(Certfor);

        System.out.println("Cards have been added : " + labelrepository.findAll());

    }
}
