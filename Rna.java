class RnaTranscription {
    String transcribe(String dnaStrand) {
        char[] dnaStrandTrans= dnaStrand.toCharArray();
        String rnaStrand ="";
        for(char a: dnaStrandTrans){
            switch(a){
                case 'G' :
                    rnaStrand+="C";
                    break;
                case 'C' :
                    rnaStrand+="G";
                    break;
                case 'T' :
                    rnaStrand+="A";
                    break;
                case 'A' :
                    rnaStrand+="U";
                    break;
            }
        }
        return rnaStrand;
    }
}
