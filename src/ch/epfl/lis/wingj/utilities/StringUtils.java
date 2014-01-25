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

package ch.epfl.lis.wingj.utilities;

import java.io.PrintWriter;
import java.io.StringWriter;

/** 
 * Utility methods to manipulate strings.
 * 
 * @version November 11, 2011
 *
 * @author Thomas Schaffter (thomas.schaff...@gmail.com)
 */
public class StringUtils {
	
	// ============================================================================
	// PUBLIC METHODS

	/** Removes the leading and trailing quotes from a given string. */
	public static String stripLeadingAndTrailingQuotes(String str) {
		
		if (str.startsWith("\""))
			str = str.substring(1, str.length());
		if (str.endsWith("\""))
			str = str.substring(0, str.length() - 1);

		return str;
	}
	
	// ----------------------------------------------------------------------------
	
	/** Returns a string describing the given exception, including nested exceptions. */
	public static String exceptionToString(Throwable e) {
		
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}
}
