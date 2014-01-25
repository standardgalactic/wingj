/*
Copyright (c) 2010-2013 Thomas Schaffter & Ricard Delgado-Gonzalo

We release this software open source under a Creative Commons Attribution
-NonCommercial 3.0 Unported License. Please cite the papers listed on 
http://lis.epfl.ch/wingj when using WingJ in your publication.

For commercial use, please contact Thomas Schaffter 
(thomas.schaff...@gmail.com).

A brief description of the license is available at 
http://creativecommons.org/licenses/by-nc/3.0/ and the full license at 
http://creativecommons.org/licenses/by-nc/3.0/legalcode.

The above copyright notice and this permission notice shall be included 
in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package ch.epfl.lis.wingj.structure.drosophila.embryo;

import ch.epfl.lis.wingj.WJSystem;
import ch.epfl.lis.wingj.structure.Structure;

/** 
 * Drosophila embryo system.
 * 
 * @version February 13, 2013
 * 
 * @author Thomas Schaffter (thomas.schaff...@gmail.com)
 */
public class EmbryoSystem extends WJSystem {
	
	// ============================================================================
	// PUBLIC METHODS
	
	/** Constructor. */
	public EmbryoSystem(int id) {
		
		super(id, "DrosoEmbryoSchaffter2013");
		name_ = "Drosophila embryo";
		description_ = "<html><b>Unsupervised detection of the <i>Drosophila</i> embryo structure</b><br>" +
			"The expression of any protein that is nearly continously expressed in the embryo or<br>" +
			"at least all around its contour can be used to segment outer boundary of the embryo.<br>" +
			"Anterior/posterior (A/P) and dorsal/ventral (D/V) compartment boundaries are created<br>" +
			"based on the axes of the inferred ellipse shape that fits the contour of the embryo.<br>" +
			"<br>" +
			"<b>T Schaffter, R Delgado-Gonzalo, F Hamaratoglu, M Affolter, M Unser, and D Floreano</b>.<br>" +
			"Towards unsupervised and systematic quantification of biological systems, vol, num, pages, 2013.</html>";
	}
	
	// ----------------------------------------------------------------------------
	
	/** Returns a new detector for the current system. */
	@Override
	public void newStructureDetector(String experimentName) throws Exception {
		
		deleteStructureDetector();
		structureDetector_ = new EmbryoStructureDetector(experimentName);
	}
	
	// ----------------------------------------------------------------------------
	
	/** Returns a new structure object. */
	@Override
	public Structure newStructure() throws Exception {
		
		return new EmbryoStructure(new String(name_).replaceAll(" ", "_"));
	}
}
