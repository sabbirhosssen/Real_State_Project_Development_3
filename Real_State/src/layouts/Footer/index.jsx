import React from "react";
import { FaFacebookF, FaLinkedinIn, FaTwitter } from "react-icons/fa";

const Footer = () => {
  return (
    <>
      <footer
        className="relative  text-white pt-12 "
        style={{
          backgroundImage: "url('/Images/footer_bg.png')", // Replace with your image path
          backgroundSize: "cover",
          backgroundPosition: "center",
        }}
      >
        {/* Dark overlay */}
        <div className="absolute inset-0  "></div>

        {/* Content */}
        <div className="relative z-10">
          {/* Top Section: Newsletter */}
          <div className="max-w-4xl mx-auto mb-10 text-center">
            <form className="flex flex-col sm:flex-row items-center justify-center gap-4">
              <input
                type="text"
                placeholder="Write Email Here"
                className="px-4 py-2 rounded-full w-full sm:w-2/3 text-white border-4 focus:outline-none focus:border-green-300"
              />
              <button
                type="submit"
                className="bg-white text-black font-semibold px-6 py-2 rounded-full hover:bg-gray-200 transition"
              >
                Subscribe
              </button>
            </form>
          </div>
          <div className="bg-black opacity-74 pb-6 px-6">
            {/* Middle Section: Links & Info */}
            <div className=" grid grid-cols-1 sm:grid-cols-2 md:grid-cols-4 gap-8 mb-10 py-5 px-4">
              {/* Column 1 */}
              <div className="col-span-2 ...">
                <h2 className="text-lg font-semibold mb-2">FAIRWAYCLIFFS</h2>
                <p className="text-sm text-gray-300 mb-4">
                  Lorem ipsum dolor sit amet, consectetur ur. Ultrices diam non
                  oda oda tellus eget.Lorem
                </p>
                <div className="flex space-x-3 text-lg">
                  <FaFacebookF className="hover:text-gray-400 cursor-pointer" />
                  <FaLinkedinIn className="hover:text-gray-400 cursor-pointer" />
                  <FaTwitter className="hover:text-gray-400 cursor-pointer" />
                </div>
              </div>

              {/* Column 2 */}
              <div className="space-y-2 text-sm">
                <p>Contact Us</p>
                <p>About Us</p>
                <p>Help</p>
                <p>View More</p>
                <p>Customer Supports</p>
              </div>

              {/* Column 3 */}
              <div className="space-y-2 text-sm">
                <p>Our Services</p>
                <p>Our Reviews</p>
                <p>Our Team</p>
                <p>Pricing</p>
                <p>Benefits</p>
              </div>
            </div>

            {/* Bottom Section */}
            <div className="text-center text-sm text-gray-400 border-t border-gray-700 pt-4">
              Create by Sabbir hossen &copy; Copyright 2025
            </div>
          </div>
        </div>
      </footer>
    </>
  );
};

export default Footer;
