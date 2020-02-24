package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.Arrays;

/**
 * Says "Hi" to the user.
 */
@Mojo(name = "bonjour")
public class AnotherMojo extends AbstractMojo {
    @Parameter(property = "qui")
    private String qui;

    @Parameter(property = "quis")
    private String[] quis;

    @Parameter(property = "b")
    private boolean aBoolean;

    @Parameter(property = "l")
    private long aLong;

    @Parameter(property = "si")
    private Integer integer;

    @Parameter(property = "pi")
    private int anInt;

    public void execute() throws MojoExecutionException {
        getLog().info(String.format("Bonjour, %s, %s, %b, %d, %d, %d.",qui, Arrays.toString(quis), aBoolean, aLong, integer, anInt));
    }
}