package scala_hello_world_plugin;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
class Activator extends AbstractUIPlugin {
    // The plug-in ID
  val PLUGIN_ID = "test_plugin"

  /*
   * (non-Javadoc)
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  override def start(context: BundleContext) {
    super.start(context);
    Activator.plugin = this;
  }
  
  /*
   * (non-Javadoc)
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  override def stop(context: BundleContext) {
    Activator.plugin = null;
    super.stop(context);
  }
  
  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  def getDefault() {
    return Activator.plugin;
  }

  /**
   * Returns an image descriptor for the image file at the given
   * plug-in relative path
   *
   * @param path the path
   * @return the image descriptor
   */
  def getImageDescriptor(path: String) {
    AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
  }
}

object Activator {
  // The shared instance
  private var plugin: Activator = _

}
