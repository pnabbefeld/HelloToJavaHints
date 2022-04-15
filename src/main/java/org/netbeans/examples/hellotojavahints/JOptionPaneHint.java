/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/javaHint.java to edit this template
 */
package org.netbeans.examples.hellotojavahints;

import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.java.hints.ConstraintVariableType;
import org.netbeans.spi.java.hints.ErrorDescriptionFactory;
import org.netbeans.spi.java.hints.Hint;
import org.netbeans.spi.java.hints.HintContext;
import org.netbeans.spi.java.hints.TriggerPattern;
import org.openide.util.NbBundle.Messages;

@Hint(displayName = "#DN_JOptionPaneHint", description = "#DESC_JOptionPaneHint", category = "general")
@Messages({
    "DN_JOptionPaneHint=JOptionPane.showMessageDialog",
    "DESC_JOptionPaneHint=Checks for JOptionPane.showMessageDialog."
})
public class JOptionPaneHint {

    @TriggerPattern(
            value = "$1.showMessageDialog",
            constraints = @ConstraintVariableType(
                    variable = "$1",
                    type = "javax.swing.JOptionPane")
    )
    @Messages("ERR_JOptionPaneHint=Is JOptionPane.showMessageDialog needed?")
    public static ErrorDescription computeWarning(HintContext ctx) {
        return ErrorDescriptionFactory.forName(ctx, ctx.getPath(), Bundle.ERR_JOptionPaneHint());
    }

}
