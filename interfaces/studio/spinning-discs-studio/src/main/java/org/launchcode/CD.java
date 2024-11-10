package org.launchcode;

public class CD extends Media implements OpticalDisc {

    private boolean isMusicCd;

    public CD(String name, boolean isMusicCd) {
        super(name, "", 800, 700);
        this.isMusicCd = isMusicCd;
        setDiscType(isMusicCd ? "music CD" : "CD-RW");
    }

    public CD(String name) {
        this(name, false);
    }

    public boolean isMusicCD() {
        return isMusicCd;
    }

    public void setMusicCd(boolean musicCd) {
        isMusicCd = musicCd;
    }

    @Override
    public String toString() {
        String header = isMusicCd ? "Tracks" : "Files";
        return super.toString() + getFormattedFileList(header);
    }

    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCd ? "track" : "file";
        if (getFiles().contains(file)) {
            System.out.println("The " + fileType + " " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("Warning: There is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The " + fileType + " " + file.getName() + " has been added to " + getName() + ".");
        }

    }

    @Override
    public void removeFile(File file) {
        if (isMusicCd) {
            System.out.println("Individual files cannot be removed from a music CD once written");
        } else {
            spinDisc();
            if (fileIsPresent(file)) {
                getFiles().remove(file);
                System.out.println("The file " + file.getName() + " has been removed from the " + getDiscType());
            }
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
        setMusicCd(false);
        setDiscType("CD - RW");
        setName("Unnamed CD-RW");
    }

    @Override
    public void runFile(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            String verb = isMusicCd ? "Playing " : "Opening file ";
            System.out.println(verb + file.getName() + "...");
        }

    }
}

