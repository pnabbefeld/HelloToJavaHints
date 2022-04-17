/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/javaHintTest.java to edit this template
 */
package org.netbeans.examples.hellotojavahints;

import java.io.File;
import org.junit.Test;
import org.netbeans.modules.java.hints.test.api.HintTest;

/* TODO to make this test work:
   - to ensure that the newest Java language features supported by the IDE are available,
     regardless of which JDK you build the module with:
   -- for Ant-based modules, add "requires.nb.javac=true" into nbproject/project.properties
   -- for Maven-based modules, use dependency:copy in validate phase to create
      target/endorsed/org-netbeans-libs-javacapi-*.jar and add to endorseddirs
      in maven-compiler-plugin and maven-surefire-plugin configuration
      See: http://wiki.netbeans.org/JavaHintsTestMaven
 */
//@Ignore
public class JOptionPaneHintTest {

    @Test
    public void testWarningProduced() throws Exception {
//        HintTest.create()
//                .input("package test;\n"
//                        + "public class Test {\n"
//                        + "    public static void main(String[] args) {\n"
//                        + "        assert args[0].equals(\"\");\n"
//                        + "    }\n"
//                        + "}\n")
//                .run(JOptionPaneHint.class)
//                .assertWarnings("3:23-3:29:verifier:" + Bundle.ERR_JOptionPaneHint());
        try {
            File f = new File("/tmp/tests-peter/org.netbeans.examples.hellotojavahints.JOptionPaneHintTest/testWarningProduced/src/test/Test.java");
            f.delete();
            System.out.println("Removed temporary file");
        } catch (Exception ex) {
        }
        HintTest ht = HintTest.create();
        HintTest hti = ht.input("package test;\n"
                + "import javax.swing.JFrame;\n"
                + "import javax.swing.JOptionPane;\n"
                + "public class Test {\n"
                + "    public static void main(String[] args) {\n"
                + "        JFrame parent = new JFrame();\n"
                + "        JOptionPane.showMessageDialog(parent, \"test message\");\n"
                + "    }\n"
                + "}\n");
        HintTest.HintOutput hto = hti.run(JOptionPaneHint.class);
        hto.assertWarnings("3:23-3:29:verifier:" + Bundle.ERR_JOptionPaneHint());
    }

}
