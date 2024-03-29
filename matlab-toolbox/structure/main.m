% Copyright (c) 2010-2013 Thomas Schaffter, Ricard Delgado-Gonzalo
%
% We release this software open source under a Creative Commons Attribution
% -NonCommercial 3.0 Unported License. Please cite the papers listed on 
% http://lis.epfl.ch/wingj when using WingJ in your publication.
%
% For commercial use, please contact Thomas Schaffter 
% (thomas.schaff...@gmail.com).
%
% A brief description of the license is available at 
% http://creativecommons.org/licenses/by-nc/3.0/ and the full license at 
% http://creativecommons.org/licenses/by-nc/3.0/legalcode.
%
% The above copyright notice and this permission notice shall be included 
% in all copies or substantial portions of the Software.
%
% THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS 
% OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF 
% MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
% IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY 
% CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
% OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR 
% THE USE OR OTHER DEALINGS IN THE SOFTWARE.
%
% This example shows how to create a repository of structure objects from
% reading structure files (XML) exported by WingJ.
%
% Author: Thomas Schaffter (thomas.schaff...@gmail.com)
% Version: June 13, 2011
clc; clear

% Build list of files.
folder = 'rsc/';
files = dir([folder '*.xml']);

% Create the repository that will contain the structure objects.
n = length(files);
structures = StructureList(n);

% Read the structure files and save them to the repository.
for i=1:n
    filename = [folder files(i).name];
    disp(['Reading ' filename])
    s = structure(filename);
    structures.set(i,s);
end

% Perform an operation on all the wing contained in the repository. Here we
% query the name given to the experiment (given in WingJ).
structures.getExperimentNames()