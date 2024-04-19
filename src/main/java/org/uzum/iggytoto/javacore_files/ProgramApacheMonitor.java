package org.uzum.iggytoto.javacore_files;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class ProgramApacheMonitor {

    public static void main(String[] args) throws Exception {

        final File dir = new File("testDir");

        System.out.println(dir.getAbsolutePath());

        if(!dir.exists()){
            dir.mkdir();
        }

        final FileAlterationObserver observer = new FileAlterationObserver(dir);

        final FileAlterationMonitor monitor = new FileAlterationMonitor(3000);

        monitor.addObserver(observer);

        observer.addListener(new Listener());

        monitor.start();
    }

    public static class Listener implements FileAlterationListener {

        @Override
        public void onDirectoryChange(File file) {
            System.out.println("Directory change:" + file.getName());
        }

        @Override
        public void onDirectoryCreate(File file) {
            System.out.println("Directory create:" + file.getName());
        }

        @Override
        public void onDirectoryDelete(File file) {
            System.out.println("Directory delete:" + file.getName());
        }

        @Override
        public void onFileChange(File file) {
            System.out.println("file change:"  + file.getName());
        }

        @Override
        public void onFileCreate(File file) {
            System.out.println("file create:"  + file.getName());
        }

        @Override
        public void onFileDelete(File file) {
            System.out.println("file delete:"  + file.getName());
        }

        @Override
        public void onStart(FileAlterationObserver fileAlterationObserver) {
            System.out.println("on start");
        }

        @Override
        public void onStop(FileAlterationObserver fileAlterationObserver) {
            System.out.println("on stop");
        }
    }


}
