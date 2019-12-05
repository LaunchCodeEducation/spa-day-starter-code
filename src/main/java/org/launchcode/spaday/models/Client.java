package org.launchcode.spaday.models;

import java.util.ArrayList;

public class Client {

    private String skinType;
    private String nailService;
    private ArrayList<String> appropriateFacials = new ArrayList<>();

    public Client(String skinType, String nailService) {
        this.skinType = skinType;
        this.nailService = nailService;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getNailService() {
        return nailService;
    }

    public void setNailService(String nailService) {
        this.nailService = nailService;
    }

    public ArrayList<String> getAppropriateFacials() {
        return appropriateFacials;
    }

    private boolean checkSkinType(String skinType, String facialType) {
        if (skinType.equals("oily")) {
            if (facialType.equals("Microdermabrasion") || facialType.equals("Rejuvenating")) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (skinType.equals("combination")) {
            if (facialType.equals("Microdermabrasion") || facialType.equals("Rejuvenating") || facialType.equals("Enzyme Peel")) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (skinType.equals("normal")) {
            return true;
        }
        else if (skinType.equals("dry")) {
            if (facialType.equals("Rejuvenating") || facialType.equals("Hydrofacial")) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }

    public void setAppropriateFacials(String skinType) {
        ArrayList<String> facials = new ArrayList<String>();
        facials.add("Microdermabrasion");
        facials.add("Hydrofacial");
        facials.add("Rejuvenating");
        facials.add("Enzyme Peel");

        for (int i = 0; i < facials.size(); i ++) {
            if (checkSkinType(skinType,facials.get(i))) {
                appropriateFacials.add(facials.get(i));
            }
        }
    }
}
