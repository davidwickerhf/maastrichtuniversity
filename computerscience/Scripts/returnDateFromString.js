/**
 *
 * @param {String} dateString Of the type "YYYY-MM-DD"
 * @returns {Date} Date object matching the date String
 */
function returnDateFromString(dateString) {
  return new Date(dateString);
}

module.exports = returnDateFromString;
